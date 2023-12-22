import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String test = "0";
        while(true) {
            String str = sc.nextLine();
            int sum =0;
            if(str.equals(test))break;
            for(int i=0;i<str.length();i++){
            	sum+=Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            if(sum!=0)System.out.println(sum);
        }
        sc.close();
    }
}

