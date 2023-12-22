import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n = scan.nextInt();
            if(n == 0){
                break;
            }
            int m = scan.nextInt() - (n<<1);
            char[] ch = (scan.next()).toCharArray();
            int count = 0;
            for(int i = 0;i < m;i++){
                if(ch[i] == 'I'){
                    for(int j = 0;j < n;j++){
                        if(ch[i+1+(j<<1)] != 'O' || ch[i+((j+1)<<1)] != 'I'){
                            break;
                        }else if(j == n-1){
                            count++;
                            i++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}