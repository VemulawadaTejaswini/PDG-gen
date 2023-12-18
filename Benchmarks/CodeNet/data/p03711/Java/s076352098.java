public class Hoge{
	public static void main(String[] args){
	
	int x = Integer.parseInt(args[0]);
	int y = Integer.parseInt(args[1]);
	int group1[] = new int[10];
	int group2[] = new int[10];
 	int x_group = 0;
	int y_group = 0;
	
	for(int i=0;i < 7;i++){
		if(x == group1[i]){
			x_group = 1;
		}else if(x == group2[i]){
			x_group = 2;
		}else{
			x_group = 3;
		}
	}
	
	for(int i=0;i < 7;i++){
		if(y == group1[i]){
			y_group = 1;
		}else if(y == group2[i]){
			y_group = 2;
		}else{
			y_group = 3;
		}
	}
	
	if(x_group == y_group){
		System.out.println("yes");
	}else{
		System.out.println("no");
	}
	
	}
}