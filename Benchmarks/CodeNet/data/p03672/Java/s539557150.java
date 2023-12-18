import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        int l,i;
        while(str.length()!=2){
            l=str.length();
            str=str.substring(0,l-2);
            System.out.println(str);
            l=str.length();
            for(i=0;i<l/2;i++){
                if(str.charAt(i)!=str.charAt(l/2+i)){
                    break;
                }
                else if(i==l/2-1){
                    System.out.println(l);
                    return;
                }
            }
        }
    }
}