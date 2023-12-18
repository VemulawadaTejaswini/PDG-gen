import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        int size = s.length;
        int hug = 0;
        for(int i=0; i<size;i++){
            if(s[i].equals(s[size-1-i])){
                continue;
            }
            else{
                s[i] = s[size-1-i];
                hug++;
            }
        }

        System.out.println(hug);
    }
}
