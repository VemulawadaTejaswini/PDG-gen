import java.util.*;
public class Main {
	public static void main(String[] args){
		String name[];
		name = new String[200000];
		int num[];
		num = new int[200000];
		int flag = 0;
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		for(int j = 0 ;j<i ;j++){
			flag = 0;
			String a = sc.next();
			int listlen = name.length;
			if (listlen == 0){
				name[0] = a;
				num[0] = 1;
			}else{
				for(int k = 0;k<listlen;k++){
					if(name[k]==a){
						num[k] = num[k]+1;
						k = listlen;
						flag = 1;
					}
				}
				if(flag == 0){
					name[listlen] = a;
					num[listlen] = 1;
				}
			}
		}
		
		for(int z=0;z<num.length-1;z++){
			for(int j=num.length-1;j>z;j--){
				if(num[j]<num[j-1]){
					int t=num[j];
					num[j]=num[j-1];
					num[j-1]=t;
					String s=name[j];
					name[j]=name[j-1];
					name[j-1]=s;
				}
			}
		}
		for(int z=0;z<name.length;z++){
			System.out.println(name[z]);
		}	
	}
}