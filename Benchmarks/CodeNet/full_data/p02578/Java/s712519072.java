import java.util.*;

public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();
        int N = Integer.parseInt(str);
        str = sc.nextLine();
        String[] strA = str.split(" ");
                sc.close();

                int count=0;
        int prev_person = Integer.parseInt(strA[0]);

        for(int i = 1; i < strA.length; i++){
            int now_person = Integer.parseInt(strA[i]);
            if(now_person < prev_person){
                count += prev_person - now_person;
            }
            else{
                prev_person = now_person;
            }
            
        }


                System.out.println(count);

        }
}

