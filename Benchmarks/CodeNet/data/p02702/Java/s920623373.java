import java.util.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
            String s = sc.next();

            int sum = 0;
            int ans = 0;

            for(int i = 0; i < s.length() - 2; i++){
                sum = 0;
                sum += Integer.parseInt(s.substring(i, i + 1));

                for(int j = i + 1; j < s.length(); j++){
                    sum += Integer.parseInt(s.substring(j, j + 1));
                    if(sum % 3 == 0){
                        long subNum = Long.parseLong(s.substring(i, j + 1));
                        if(subNum % 673 == 0) ans++;
                    }
                }
            }

            System.out.println(ans);

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}
