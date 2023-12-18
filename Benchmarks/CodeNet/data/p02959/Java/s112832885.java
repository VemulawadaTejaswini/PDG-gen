import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] monster=new int[n+1];
        int[] hero =new int[n]; 
        int cnt=0;
        for(int i=0;i<n+1;i++){
            monster[i]=scn.nextInt();
        }
        for(int i=0;i<n;i++){
            hero[i]=scn.nextInt(); //i or i+1
        }
        if(monster[n]>hero[n-1]){
            cnt+=hero[n-1];
            hero[n-1]=0;
        }else{
            cnt+=monster[n];
            hero[n-1]-=monster[n];
        }
        int remain=0;
        for(int i=0;i<n;i++){
            if(monster[i]>hero[i]+remain){
                cnt+=hero[i]+remain;
                remain=0;
            }else{
                remain=hero[i]+remain-monster[i];
                cnt+=monster[i];
            }
        }
        System.out.println(cnt);
    }
}