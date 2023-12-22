import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String[] str=sc.next().split(",");
			double[] l=new double[10];
			double length=0;
			for(int i=0;i<10;i++){
				l[i]=Integer.parseInt(str[i]);
				length=length+l[i];
			}
			double v1=Integer.parseInt(str[10]);
			double v2=Integer.parseInt(str[11]);
			double cross=v1*(length/(v1+v2));
			int part=0;
			length=0;
			for(int i=0;i<10;i++){
				length=length+l[i];
				part++;
				if(length>=cross){
					break;
				}
			}
			System.out.println(part);
		}
	}
}