import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String[] array = s.split("");
        int count = 0;
        for(int i=0;i<n-2;i++){
            if(array[i].equals("A")){
                if(array[i+1].equals("B")){
                    if(array[i+2].equals("C")){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
