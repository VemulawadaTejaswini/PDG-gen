import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str,num;
        int a,b,i;

        while(true){
            str = scan.nextLine();
            if(str.equals("-")){
                break;
            }
            num = scan.nextLine();
            a = Integer.valueOf(num);
            for(i=0;i<a;i++){
                num = scan.nextLine();
                b = Integer.valueOf(num);
                str = str.substring(b) + str.substring(0,b);
            }
            System.out.println(str);
        }


        scan.close();

    }

}

