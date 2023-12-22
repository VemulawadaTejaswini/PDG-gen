import java.util.*;
public class Main {

	public static void main(String[] args) {
		int two=200;
		int three=300;
		int five=500;
		Scanner std=new Scanner(System.in);
		int weight=std.nextInt();
		while (weight!=0){
			int min=1000000;
			for (int i=0;i<=weight/two;i++){
				for (int j=0;j<=weight/three;j++){
					for (int k=0;k<=weight/five;k++){
						if (i*two+j*three+k*five==weight){
							int temp=0;
							temp+=380*(i/5)*5*0.8+380*(i%5);
							temp+=550*(j/4)*4*0.85+550*(j%4);
							temp+=850*(k/3)*3*0.88+850*(k%3);
							if (temp<min)
								min=temp;
						}
					}
				}
			}	
			System.out.println(min);
			weight=std.nextInt();
		}
	}
}