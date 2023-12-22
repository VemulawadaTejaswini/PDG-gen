import java.util.Scanner;
class Main{
	public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        while(true){
            int x=scan.nextInt();
            int y=scan.nextInt();
            int s=scan.nextInt();
            if(x==0 && y==0 && s==0){
                break;
            }
            int[] data={x+100,y+100,s};
            System.out.println(doMoney(data));
        }
    }
    private static int doMoney(int[] data){
        int max=-1;
        for(int i=1;i<=data[2];i++){
            int[] old=new int[2];
            old[0]=i*data[0]/100;
            double hoge=data[2]-(double)(old[0]*data[0])/100;
            old[1]=(int)(hoge*100/data[0]);
            int temp=(old[0]*data[1]/100)+(old[1]*data[1]/100);
            // System.out.println("i="+i+":"+old[0]+":"+old[1]+":"+temp+":"+max);
            if(max<temp){
                max=temp;
            }
        }
        return max;
    }
}
