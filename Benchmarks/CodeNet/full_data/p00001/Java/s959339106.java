import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] top={-1,-1,-1};
		for(int i=0;i<10;i++){
			int hight = Integer.parseInt(sc.nextLine());
			for(int j=0;j<3;j++){
				if(top[j]<hight){
                                    int store=top[j];
                                    top[j]=hight;
                                    if(j==0){
                                        hight=top[j+1];
                                        top[j+1]=store;
                                        top[j+2]=hight;
                                    }else if(j==1){
                                        top[j+1]=store;
                                    }
                                    break;
				}
			}
		}
		System.out.println(top[0]);
		System.out.println(top[1]);
		System.out.println(top[2]);
		
	}
}
