import java.util.*;

public class Main {

    static final int MOD=1000000007;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> str = new LinkedList<>();
        char[] s = sc.next().toCharArray();
        int currentLength=s.length;

        for(int i=0;i<s.length;i++){
            str.add(s[i]);
        }
        int q = sc.nextInt();

        for(int i=0;i<q;i++){
            int t =sc.nextInt();
            if(t==1){
                char temp = str.get(0);
                str.set(0,str.get(currentLength-1));
                str.set(currentLength-1,temp);
            }else{
                int f = sc.nextInt();
                char c = sc.next().charAt(0);
                currentLength++;
                if(f==1){
                    str.add(0,c);
                }else{
                    str.add(c);
                }
            }


        }

        for(Character c:str){
            System.out.print(c);
        }
        System.out.println();


    }
}


