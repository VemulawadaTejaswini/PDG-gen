import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0) break;
			String gomi=sc.nextLine();
			String data=sc.nextLine();
			String[] data2=data.split(" ");
			Integer[] man = new Integer[26];
			for(int i=0;i<26;++i){
				man[i]=0;
			}
			int flag=-1;
			for(int i=0;i<n;++i){
				if(data2[i].matches("A")==true) man[0]+=1;
				else if(data2[i].matches("B")==true) man[1]+=1;
				else if(data2[i].matches("C")==true) man[2]+=1;
				else if(data2[i].matches("D")==true) man[3]+=1;
				else if(data2[i].matches("E")==true) man[4]+=1;
				else if(data2[i].matches("F")==true) man[5]+=1;
				else if(data2[i].matches("G")==true) man[6]+=1;
				else if(data2[i].matches("H")==true) man[7]+=1;
				else if(data2[i].matches("I")==true) man[8]+=1;
				else if(data2[i].matches("J")==true) man[9]+=1;
				else if(data2[i].matches("K")==true) man[10]+=1;
				else if(data2[i].matches("L")==true) man[11]+=1;
				else if(data2[i].matches("M")==true) man[12]+=1;
				else if(data2[i].matches("N")==true) man[13]+=1;
				else if(data2[i].matches("O")==true) man[14]+=1;
				else if(data2[i].matches("P")==true) man[15]+=1;
				else if(data2[i].matches("Q")==true) man[16]+=1;
				else if(data2[i].matches("R")==true) man[17]+=1;
				else if(data2[i].matches("S")==true) man[18]+=1;
				else if(data2[i].matches("T")==true) man[19]+=1;
				else if(data2[i].matches("U")==true) man[20]+=1;
				else if(data2[i].matches("V")==true) man[21]+=1;
				else if(data2[i].matches("W")==true) man[22]+=1;
				else if(data2[i].matches("X")==true) man[23]+=1;
				else if(data2[i].matches("Y")==true) man[24]+=1;
				else man[25]+=1;
				flag=ref(man,n-i-1);
				if(flag!=-1){
					print(flag,i+1);
					break;
				}
			}
			if(flag==-1) System.out.println("TIE");
		}
	}

	public static int ref(Integer[] data, int part){
		int max=-1,num=0,flag=0;
		for(int i=0;i<26;++i){
			if(max<data[i]){
				max=data[i];
				num=i;
				flag=1;
			} else if(max==data[i]){
				flag=+1;
			}
		}
		if(flag==1){
			for(int i=0;i<26;++i){
				if(i!=num && max<=data[i]+part){
					flag+=1;
					break;
				}
			}
		}
		if(flag==1) return num;
		else return -1;
	}
	
	public static void print(int flag, int point){
		if(flag==0) System.out.println("A "+point);
		else if(flag==1) System.out.println("B "+point);
		else if(flag==2) System.out.println("C "+point);
		else if(flag==3) System.out.println("D "+point);
		else if(flag==4) System.out.println("E "+point);
		else if(flag==5) System.out.println("F "+point);
		else if(flag==6) System.out.println("G "+point);
		else if(flag==7) System.out.println("H "+point);
		else if(flag==8) System.out.println("I "+point);
		else if(flag==9) System.out.println("J "+point);
		else if(flag==10) System.out.println("K "+point);
		else if(flag==11) System.out.println("L "+point);
		else if(flag==12) System.out.println("M "+point);
		else if(flag==13) System.out.println("N "+point);
		else if(flag==14) System.out.println("O "+point);
		else if(flag==15) System.out.println("P "+point);
		else if(flag==16) System.out.println("Q "+point);
		else if(flag==17) System.out.println("R "+point);
		else if(flag==18) System.out.println("S "+point);
		else if(flag==19) System.out.println("T "+point);
		else if(flag==20) System.out.println("U "+point);
		else if(flag==21) System.out.println("V "+point);
		else if(flag==22) System.out.println("W "+point);
		else if(flag==23) System.out.println("X "+point);
		else if(flag==24) System.out.println("Y "+point);
		else System.out.println("Z "+point);
	}
}

