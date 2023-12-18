import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int max = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='A'||s.charAt(i)=='T'||s.charAt(i)=='G'||s.charAt(i)=='C'){count++;}
            else{
                if(max < count){max = count;count=0;}
            }
        }
        System.out.println(max);
    }
}

