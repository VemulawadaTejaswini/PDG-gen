import java.util.*;

class Main{
	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int mX,mY;
        int ang=0;
        String[] puts=new String[50];
        
        do{
			int x=sc.nextInt();
	        int y=sc.nextInt();
			String s=sc.next();
			while(!(s.equals("STOP"))){
	            if(s.equals("FORWARD"){
					int f=sc.nextInt();
					switch(ang){
						case 0:
							for(int i=0;i<f;i++){
								if(x!=100){
									x++;
								}
							}
							break;
						case 1:
							for(int i=0;i<f;i++){
								if(y!=100){
									y++;
								}
							}
							break;
						case 2:
							for(int i=0;i<f;i++){
								if(x!=0){
									x--;
								}
							}
							break;
						case 3:
							for(int i=0;i<f;i++){
								if(y!=0){
									y--;
								}
							}
							break;
					}
				}else if(s.equals("RIGHT"){
					if(ang!=3){
						ang++;
					}else{
						ang=0;
					}
				}else if(s.equals("LEFT"){
					if(ang!=0){
						ang--;
					}else{
						ang=3;
					}
				}
			}
			System.out.println(mX+" "+mY);
		}while((x!=0)&&(y!=0));
	}
}

