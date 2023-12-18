import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int quesNum = sc.nextInt();
        String input = sc.next();
        
        for(int i = 0; i < quesNum; i++){
            int ans = 0;
            boolean aFlag = false;
            int left = sc.nextInt();
            int right = sc.nextInt();
            String str = input.substring(left-1, right);

            for(int j = 0; j < str.length(); j++){
                if(aFlag){
                    if(str.charAt(j)=='C')ans++;
                    aFlag = false;
                }
                aFlag = str.charAt(j) == 'A';
            }
            System.out.println(ans);
        }
    }
}