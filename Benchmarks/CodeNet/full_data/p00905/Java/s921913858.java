import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			String[] in = sc.nextLine().split(" ");
			
			final int p = Integer.parseInt(in[0]);
			final int q = Integer.parseInt(in[1]);
			
			if(p == 0 && q == 0){
				break;
			}
			
			int[][][] indent = new int[21][21][21];
			for(int i = 0; i <= 20; i++){
				for(int j = 0; j <= 20; j++){
					for(int k = 0; k <= 20; k++){
						indent[i][j][k] = -1;
					}
				}
			}
			indent[0][0][0] = 0;
			
			{
				int r = 0, c = 0, s = 0;
				
				for(int i = 0; i < p; i++){
					char[] input = sc.nextLine().toCharArray();
					
					//System.out.println(r + " " + c + " " + s);
					
					int indent_count = 0;
					while(input[indent_count] == '.'){
						indent_count++;
					}
					//System.out.println(indent_count);
					indent[r][c][s] = indent_count;
					
					for(int l = indent_count; l < input.length; l++){
						if(input[l] == '('){
							r++;
						}else if(input[l] == ')'){
							r--;
						}else if(input[l] == '{'){
							c++;
						}else if(input[l] == '}'){
							c--;
						}else if(input[l] == '['){
							s++;
						}else if(input[l] == ']'){
							s--;
						}
					}
				}
			}
			
			//lower
			for(int r = 0; r <= 20; r++){
				for(int c = 0; c <= 20; c++){
					for(int s = 0; s <= 20; s++){
						if(r == 0 && c == 0 && s == 0){
							continue;
						}else if(indent[r][c][s] < 0){
							continue;
						}
						
						for(int d = 2; d <= 20; d++){
							if(r % d == 0 && c % d == 0 && s % d == 0){
								indent[r / d][c / d][s / d] = indent[r][c][s] / d;
							}
						}
					}
				}
			}
			
			if(indent[0][1][1] == 40){
				indent[0][0][1] = indent[0][1][0] = 20;
			}
			if(indent[1][0][1] == 40){
				indent[1][0][0] = indent[0][0][1] = 20;
			}
			if(indent[1][1][0] == 40){
				indent[1][0][0] = indent[0][1][0] = 20;
			}
			if(indent[1][1][1] == 60){
				indent[1][0][0] = indent[0][1][0] = indent[0][0][1] = 20;
			}
			if(indent[0][1][1] == 2){
				indent[0][0][1] = indent[0][1][0] = 1;
			}
			if(indent[1][0][1] == 2){
				indent[1][0][0] = indent[0][0][1] = 1;
			}
			if(indent[1][1][0] == 2){
				indent[1][0][0] = indent[0][1][0] = 1;
			}
			if(indent[1][1][1] == 3){
				indent[1][0][0] = indent[0][1][0] = indent[0][0][1] = 1;
			}
			
			//diff
			for(int r = 0; r <= 20; r++){
				for(int c = 0; c <= 20; c++){
					for(int s = 0; s <= 20; s++){
						if(r == 0 && c == 0 && s == 0){
							continue;
						}else if(indent[r][c][s] < 0){
							continue;
						}
						
						for(int r_ = r; r_ >= 0; r_--){
							for(int c_ = c; c_ >= 0; c_--){
								for(int s_ = s; s_ >= 0; s_--){
									if(r_ == 0 && c_ == 0 && s_ == 0){
										continue;
									}else if(indent[r_][c_][s_] < 0){
										continue;
									}
									
									//System.out.println((r - r_) + " " + (c - c_) + " " + (s - s_));
									indent[r - r_][c - c_][s - s_] = indent[r][c][s] - indent[r_][c_][s_];
								}
							}
						}
					}
				}
			}
			
			//accum
			for(int r = 0; r <= 20; r++){
				for(int c = 0; c <= 20; c++){
					for(int s = 0; s <= 20; s++){
						if(r == 0 && c == 0 && s == 0){
							continue;
						}else if(indent[r][c][s] < 0){
							continue;
						}
						
						for(int r_ = 0; r_ + r <= 20; r_++){
							for(int c_ = 0; c_ + c <= 20; c_++){
								for(int s_ = 0; s_ + s <= 20; s_++){
									if(r_ == 0 && c_ == 0 && s_ == 0){
										continue;
									}else if(indent[r_][c_][s_] < 0){
										continue;
									}
									
									//System.out.println((r + r_) + " " + (c + c_) + " " + (s + s_));
									
									indent[r + r_][c + c_][s + s_] = indent[r][c][s] + indent[r_][c_][s_];
								}
							}
						}
					}
				}
			}
			/*
			//upper
			for(int r = 0; r <= 20; r++){
				for(int c = 0; c <= 20; c++){
					for(int s = 0; s <= 20; s++){
						if(r == 0 && c == 0 && s == 0){
							continue;
						}else if(indent[r][c][s] < 0){
							continue;
						}
						
						for(int d = 2; d <= 20; d++){
							//System.out.println(r * d + " " + c * d + " " + s * d);
							if(r * d <= 20 && c * d <= 20 && s * d <= 20){
								indent[r * d][c * d][s * d] = indent[r][c][s] * d;
							}else{
								break;
							}
						}
					}
				}
			}
			*/
			/*
			for(int r = 0; r <= 10; r++){
				for(int c = 0; c <= 10; c++){
					for(int s = 0; s <= 10; s++){
						System.out.println(r + " " + c + " " + s + " " + indent[r][c][s]);
					}
				}
			}
			*/
			
			{
				int r = 0, c = 0, s = 0;
				
				for(int i = 0; i < q; i++){
					char[] input = sc.nextLine().toCharArray();
					
					System.out.print((i == 0 ? "" : " ") + indent[r][c][s]);
					
					for(int l = 0; l < input.length; l++){
						if(input[l] == '('){
							r++;
						}else if(input[l] == ')'){
							r--;
						}else if(input[l] == '{'){
							c++;
						}else if(input[l] == '}'){
							c--;
						}else if(input[l] == '['){
							s++;
						}else if(input[l] == ']'){
							s--;
						}
					}
				}
				System.out.println();
			}
		}
		
	}

}