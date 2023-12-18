import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int count=0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch(c){
                case 'A':count++;max = Math.max(max,count); break;
                case 'C':count++;max = Math.max(max,count); break;
                case 'G':count++;max = Math.max(max,count); break;
                case 'T':count++;max = Math.max(max,count); break;
                default:count=0;break;
            }
        }

        System.out.println(max);

    }
}