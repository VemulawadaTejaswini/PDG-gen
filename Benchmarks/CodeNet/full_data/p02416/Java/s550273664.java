import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
        String s=sc.nextLine();
        if (s.equals("0")) {
            break;
        }
        int Sum=0;

        for(int i=s.length()-1;i>=0;i--){
            char k=s.charAt(i);
            int t=k-'0';
            Sum+=t;

        }
        System.out.println(Sum);

    }
    sc.close();
    }
    
}
