import java.util.*;
public class Main{
	
	public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
		int A = 0;
        int B = 0;
        int x = 0;
        int y = 0;
        int z = 0;
        int max = 0;

        try{
            String str = sn.nextLine();
            String[] strlist = str.split(" ",0);
            A = Integer.parseInt(strlist[0]);
            B = Integer.parseInt(strlist[1]);
            sn.close();
            if(A<-100 || 100< B){
                return;
            }
            x = A + B;
            y = A - B;
            z = A * B;
            max = Math.max(x,y);
            max = Math.max(max,z);
            System.out.println(max);
        }catch(Exception e){
            //do nothing
            return;
        }
    }
}