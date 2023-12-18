import java.util.*;
public class Main{
	
	public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
		int K = 0;
        int X = 0;
        int zahyou_min = 0;
        int zahyou_max = 0;
        String ans ="" ;
        try{
            String str = sn.nextLine();
            String[] strlist = str.split(" ",0);
            K = Integer.parseInt(strlist[0]);
            X = Integer.parseInt(strlist[1]);
            sn.close();
            if(K<1 || K>100 || X <0 || X>100){
                return;
            }

            zahyou_min = X - (K-1);
            zahyou_max = X+(K-1);

            for(int i = 0; i<=2*K-2; i++){
                String tmp = String.valueOf(zahyou_min+i);
                ans = ans + (tmp+ " ");
            }
            
            System.out.println(ans);
        }catch(Exception e){
            //do nothing
            return;
        }
    }
}