package homework;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	// ?¨??????\???????????????????????????????????????
	Scanner sc = new Scanner(System.in);
	// ????????????????????????????????´??°?????¨????????????????????????
	while (true) {
	int H = sc.nextInt();
	int W= sc.nextInt();
	if ((H == 0 && W == 0) || (H > 300 || W > 300)) {
	break;
	}
	// ???????????????(for?????????for)???????????????H x W?????? # ?????¨???????????????
	for(int a = 0;a < H; a++){
		if(a % 2 == 0){
			for(int b = 0; b < W; b++){
				if(b % 2 == 0){System.out.printf("#");}
				else{System.out.printf(".");}
			}
			System.out.printf("\n");
		}else{
			for(int b = 0; b < W; b++){
				if(b % 2 == 1){System.out.printf("#");}
				else{System.out.printf(".");}
				}
			System.out.printf("\n");
		}
	}
	System.out.printf("\n");
	}
	}
	}