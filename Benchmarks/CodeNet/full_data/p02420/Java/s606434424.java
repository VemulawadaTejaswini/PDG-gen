import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String BREAKW="-";
        String ans = "";
        int count = 0;
        
        
        while(true) {
            String str =sc.nextLine();
            int LENG=str.length();
            if(str.equals(BREAKW))break;
            int n=sc.nextInt();
            for(int i=0;i<n;i++) {
            	str=str+str;
            	count+=sc.nextInt();
            }
            ans = str.substring(count,(count+LENG));
            System.out.println(ans);
            str = "";
        }
        sc.close();
    }
}
