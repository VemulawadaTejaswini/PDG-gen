import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str,str1,str2;
        int n;
        String BREAKW = "-";

        while(true){
            str = sc.next();
            if(str.equals(BREAKW))break;
            n = sc.nextInt();

            for(int i=0;i<n;i++){
            	int h=sc.nextInt();
            	str1=str.substring(0,h);
            	str2=str.substring(h);
            	str=str2+str1;
            }
            System.out.println(str);
        }
        sc.close();
    }
}
