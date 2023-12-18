import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        int flag =0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) != t.charAt(i)){
                flag =1;
                break;
            }
        }

        if(flag==1){
            System.out.println("No");
        }else if(flag==0 && (s.length()+1 == t.length())){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}