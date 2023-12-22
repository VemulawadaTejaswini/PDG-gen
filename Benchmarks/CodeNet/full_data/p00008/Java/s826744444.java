import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            int ans=0;
            for(int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    for(int k=0;k<10;k++){
                        if(n-i-j-k<=9&&n-i-j-k>=0)ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}