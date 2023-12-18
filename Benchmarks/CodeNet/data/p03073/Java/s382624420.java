import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        String beforechar = "";
        int count = 0;

        for(int i = 0; i < S.length(); i++){
            if(i==0){
                beforechar = S.substring(i,i+1);
            }else{
                if(S.substring(i,i+1).equals(beforechar)){
                   count ++;
                   if(beforechar.equals("0")){
                        beforechar = "1";
                   }else{
                       beforechar = "0";
                   }
                }else{
                    beforechar = S.substring(i,i+1);
                }
            }
        }

        System.out.println(count);

    }
}