import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); 
        String s = scan.next();
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                i+=1;
                if(s.charAt(i)=='B'){
                    i+=1;
                    if(s.charAt(i)=='C'){
                        sum+=1;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}