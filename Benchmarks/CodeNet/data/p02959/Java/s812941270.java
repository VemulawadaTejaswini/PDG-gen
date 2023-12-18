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
            hero[i]=scn.nextInt(); 
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
        cnt+=Math.min(monster[n],remain);
        System.out.println(cnt);
    }
}