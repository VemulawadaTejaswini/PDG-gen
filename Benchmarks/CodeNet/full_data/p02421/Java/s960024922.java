import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int taro = 0;
			int hanako = 0;
			
			for(int b=0;b<a;++b){
				String c = sc.next();
				String d = sc.next();
				int e ;
				if(c.length()<d.length()){
					e=c.length();
				}else{
					e=d.length();
				}
				for(int f=0;f<e;++f){
					char g = c.charAt(f);
					char h = d.charAt(f);
					if(g>h){
						taro += 3;
						break;
					}else if(g<h){
						hanako += 3;
						break;
					}else if(g==h){
						if(f==e-1){
							if(c.length()>d.length()){
								taro += 3;
							}else if(c.length()<d.length()){
								hanako += 3;
							}else{
								taro +=1;
								hanako +=1;
							}
						}
					}
				}
			}
			System.out.println(taro + " " + hanako);
	}

}