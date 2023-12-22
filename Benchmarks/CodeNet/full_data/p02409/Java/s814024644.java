import java.util.Scanner;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        ArrayList<String> room=new ArrayList<String>();
        for(int i=0;i<120;i++){
            room.add(Integer.toString(0));
        }
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b,f,r,v;
        for(int j=0;j<n;j++){
            b=sc.nextInt();
            f=sc.nextInt();
            r=sc.nextInt();
            v=sc.nextInt();
            
            int place=(b-1)*30+(f-1)*10+r;
            
            room.set(place-1,Integer.toString(v+Integer.parseInt(room.get(place-1))));
        }
        int count=0;
        for(int k=0;k<12;k++){
            if(k!=0 && k%3==0){
                System.out.println("####################");
            }
            for(int l=0;l<10;l++){
                System.out.print(" "+room.get(count));
                if(l==9){
                    System.out.println();
                }
                count++;
                
            }
        }
    }
}
