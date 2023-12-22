import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Main app = new Main();
		while(scan.hasNext()){
			int a = scan.nextInt();
			int b = scan.nextInt();
			int m = scan.nextInt();
			int count = app.zigzag(a,b,m);
			System.out.println(count%10000);
		}
	}
	
	public int zigzag(int a,int b,int m){
		int count = 0;
		int num = 0;
		while(num < a){
			num += m;
		}
		
		for(int i=num;i<=b;i+=m){
			String str = String.valueOf(i);
			int len = str.length();
			if(len == 1){
				count++;
			}else if(len==2){
				if(Integer.parseInt(""+str.charAt(0))!=
						Integer.parseInt(""+str.charAt(1))){
					count++;
				}
			}else{
				int flag = 0;
				for(int j=0;j<len-1;j++){
					if(flag==1){
						if(Integer.parseInt(""+str.charAt(j))<
						Integer.parseInt(""+str.charAt(j+1))){
							flag = -1;
						}else{
							flag = 0;
							break;
						}
					}else if(flag==-1){
						if(Integer.parseInt(""+str.charAt(j))>
						Integer.parseInt(""+str.charAt(j+1))){
							flag = 1;
						}else{
							flag = 0;
							break;
						}
					}else{
						if(Integer.parseInt(""+str.charAt(0))>
						Integer.parseInt(""+str.charAt(1))){
							flag = 1;
						}else if(Integer.parseInt(""+str.charAt(0))<
						Integer.parseInt(""+str.charAt(1))){
							flag = -1;
						}else{
							break;
						}
					}
				}
				if(flag != 0){
					count++;
				}
			}
		}
		
		return count;
	}
}