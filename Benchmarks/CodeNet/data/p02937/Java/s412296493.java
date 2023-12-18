import java.util.*;


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        long index = 0;
        int preIndex = 0;

        for(int i = 0; i < t.length(); i++){
            String c = String.valueOf(t.charAt(i));
            int tmpindex = (s.substring(preIndex) + s).indexOf(c);
            if(tmpindex >= 0){
                preIndex = (preIndex + tmpindex + 1) % s.length();
                index += tmpindex + 1;
                if(index > Math.pow(10, 100)){
                    System.out.println(-1);
                    return;
                }
            } else {
                System.out.println(-1);
                return;
            }

        }

        System.out.println(index);

	}
}