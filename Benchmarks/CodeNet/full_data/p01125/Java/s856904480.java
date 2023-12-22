import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int N = scan.nextInt();
			if(N == 0){
				break;
			}
			int[][] slide = new int[21][21];
			for(int i = 0;i < N;i++){
				slide[scan.nextInt()][scan.nextInt()] = 1;
			}
			int[] robot = new int[2];
			robot[0] = robot[1] = 10;
			int M = scan.nextInt();
			//int count = 0;
			//count += checkSlide(slide[10][10]);
			N += checkSlide(slide[10][10]);
			for(int i = 0;i < M;i++){
				String a = scan.next();
				int b = scan.nextInt();
				if(a.equals("N")){
					for(int j = 0;j < b;j++){
						robot[1] += 1;
						//count += checkSlide(slide[robot[0]][robot[1]]);
						N += checkSlide(slide[robot[0]][robot[1]]);
					}
				}else if(a.equals("S")){
					for(int j = 0;j < b;j++){
						robot[1] -= 1;
						//count += checkSlide(slide[robot[0]][robot[1]]);
						N += checkSlide(slide[robot[0]][robot[1]]);
					}
				}else if(a.equals("W")){
					for(int j = 0;j < b;j++){
						robot[0] -= 1;
						//count += checkSlide(slide[robot[0]][robot[1]]);
						N += checkSlide(slide[robot[0]][robot[1]]);
					}
				}else if(a.equals("E")){
					for(int j = 0;j < b;j++){
						robot[0] += 1;
						//count += checkSlide(slide[robot[0]][robot[1]]);
						N += checkSlide(slide[robot[0]][robot[1]]);
					}
				}
				//System.out.println("x="+robot[0]+":y="+robot[1]);
			}
			//if(count == N){
			if(N == 0){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
			//System.out.println(count);
		}
	}
	public static int checkSlide(int e){
		//return (e == 1)? 1:0;
		//return (e == 1)?0:-1;
		if(e == 1){
			return -1;
		}
		return 0;
	}
}