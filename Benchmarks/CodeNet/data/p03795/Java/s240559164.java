import java.util.scanner

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(Sytem.in);
        
        int n = sc.nextInt();
        int x = 800*n;
        int y = 200*(n/15);
        
        Sytem.out.println(x-y);
    }

}

