import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true) {
            String str = sc.nextLine();
            int sum =0;
            if(str.charAt(0)==0)break;
            for(int i=0;i<str.length();i++){
            	sum+=Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            System.out.println(sum);
        }
        sc.close();
    }
}

