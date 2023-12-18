
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

//        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        sb.append(S.charAt(0));
//        set.add(S.charAt(0));
        int i = dft(S,1,sb);
//        set.remove(S.charAt(0));
        sb.delete(sb.length()-1,sb.length());

        i += dft(S,1,sb);

        System.out.println(i);
    }

    static int mod = (int) (Math.pow(10,9) + 7);
    static int dft(String S, int idx , StringBuilder sb){

        if(idx== S.length() ){
            System.out.println(sb.toString());
            if(sb.length()>0) return 1;
            return 0;
        }
        char c = S.charAt(idx);

        int i =0;
        //use this char
//        if(set.contains(c)){
        if(sb.indexOf(c+"")>=0){
            i += 0 ;
        }else{
            //set.add(c);
            sb.append(c);
            i += dft(S,idx+1,sb);
//            set.remove(c);
            sb.delete(sb.length()-1,sb.length());
        }

        i+=dft(S,idx+1,sb);

        if(i > mod ){
            i=  i % mod;
        }


        return i;
    }

}
