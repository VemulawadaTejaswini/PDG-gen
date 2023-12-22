import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		Converter c;
		String str;

		while(true){
			n = sc.nextInt();
			if(n == 0){
				break;
			}

			c = new Converter();
			for(int i=0;i<n;i++){
				c.setData(sc.next(),sc.next());
			}

			n = sc.nextInt();
			for(int i=0;i<n;i++){
				str = sc.next();
				System.out.print(c.convert(str));
			}
			System.out.println();
		}
	}
}

class Converter{
	int[] data;

	Converter(){
		data = new int[123];
	}

	public void setData(String before,String after){
		data[(int)before.charAt(0)] = (int)after.charAt(0);
	}

	public String convert(String str){
		if(data[(int)str.charAt(0)] != 0){
			return (char)data[(int)str.charAt(0)]+"";
		}else{
			return str;
		}
	}
}