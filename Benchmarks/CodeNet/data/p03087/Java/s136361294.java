import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int quesNum = sc.nextInt();
        String input = sc.next();

        StringBuilder sb = new StringBuilder();
        boolean aFlag = false;
        for(int j = 0; j < len; j++){
            if(aFlag){
                if(input.charAt(j)=='C')sb.append(1);
                else sb.append(0);
                aFlag = false;
            }
            else{
                sb.append(0);
                aFlag = input.charAt(j) == 'A';
            }
        }
        String acs = sb.toString();
        
        for(int i = 0; i < quesNum; i++){
            int ans = 0;
            int left = sc.nextInt();
            int right = sc.nextInt();
            
            try{
                int num = Integer.parseInt(acs.substring(left, right));
                while(num > 0){
                    ans += num % 10;
                    num /= 10;
                }
            }catch(Exception e){
                ans = 0;
            }
            System.out.println(ans);
        }
    }
}