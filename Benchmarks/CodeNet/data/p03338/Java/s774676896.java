import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();

        int max = 0;

        for(int i = 1; i < n; i++){
            String str1 = str.substring(0, i);
            String str2 = str.substring(i, n);
            
            int comp = agreement(str1, str2);
            if(comp > max)
                max = comp;
        }

        System.out.println(max);
    }

    public static int agreement(String s1, String s2){
        int cnt = 0;
        int[] record = new int[26];

        for(int i = 0; i < s1.length(); i++){
            for(int j = 0; j < s2.length(); j++){
                if(record[s1.charAt(i) - 'a'] == 0){
                    if(s1.charAt(i) == s2.charAt(j)){
                        record[s1.charAt(i) - 'a']++;
                        cnt++;
                        break;
                    }
                }
                else
                    break;
            }
        }
        
        return cnt;
    }  
}