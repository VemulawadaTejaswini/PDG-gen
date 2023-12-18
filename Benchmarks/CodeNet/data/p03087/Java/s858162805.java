import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int quesNum = sc.nextInt();
        String input = sc.next();

        StringBuilder sb = new StringBuilder();
        boolean aFlag = false;
        int cnt = 0;
        for(int j = 0; j < len; j++){
            if(aFlag){
                if(input.charAt(j)=='C')cnt++;
                aFlag = false;
            }
            else aFlag = input.charAt(j) == 'A';
            sb.append(cnt);
        }
        String acs = sb.toString();
        
        for(int i = 0; i < quesNum; i++){
            int ans = 0;
            int left = sc.nextInt();
            int right = sc.nextInt();
          
            ans = Integer.parseInt(String.valueOf(acs.charAt(right-1))) - Integer.parseInt(String.valueOf(acs.charAt(left-1)));
            System.out.println(ans);
        }
    }
}