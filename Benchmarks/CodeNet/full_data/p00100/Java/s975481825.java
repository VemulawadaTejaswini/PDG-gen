import java.util.*;
class Main{
    public static void main(String[] args){
        ArrayList<String> view=new ArrayList<String>();
        while(true){
            Scanner sc =new Scanner(System.in);
            int datanum=sc.nextInt();
            int[][] data=new int[datanum][4];
            int encounter=0;
            if(datanum==0)break;
            for(int i=0;i<datanum;i++){
                for(int j=0;j<3;j++){
                    data[i][j]=sc.nextInt();
                }
                data[i][3]=data[i][1]*data[i][2];
                for(int e=i-1;e>=0;e--){
                    if(data[i][0]==data[e][0]&&data[e][3]<1000000){
                        data[i][3]+=data[e][3];
                        encounter=1;
                    }
                }
                if(data[i][3]>=1000000){
                    view.add(""+data[i][0]);
                    encounter=1;
                }
            }
            if(encounter==0)view.add("NA");
        }
        for(int i=0;i<view.size();i++)System.out.println(view.get(i));
    }
}