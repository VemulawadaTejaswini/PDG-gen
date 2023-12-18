import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 

        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();
      	int cnt = 0;
        boolean jud = true;
      
        for(int i = 0;i < s.length();i++){
            if((i == a+2 && s.charAt(i) != '-')|| (s.charAt(i) == '-')){
           		jud = false;
              continue;
            }
               cnt++;
        }

        System.out.println(jud == true && cnt == a+b+1 ? "Yes" : "No");
    }
}