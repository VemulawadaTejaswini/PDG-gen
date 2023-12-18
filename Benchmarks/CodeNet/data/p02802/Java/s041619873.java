import java.util.*;

class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int m = sc.nextInt();
Integer f[] = new Integer[m];
int ac = 0;
int wa = 0;
for(int i=1;i<n;i++){
    int p = sc.nextInt();
    String s = sc.next();
    if(s.contains("AC")){
        if(f[p-1]==0){
            f[p-1]++;
            ac++;
        }
    }else{
        wa++;
    }
}
System.out.println(ac);
System.out.println(wa);
}
}
