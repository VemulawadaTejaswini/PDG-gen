import java.util.*;

public class Main {
	public static int affine(int x , int a, int b){
		if(x == 26) return 26;
		else{
			return (a * x + b) % 26;	
		}
	}
	public static void main(String[] args) {
		
		char[] alph = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z' , ' '};
		
		Scanner scn = new Scanner(System.in);
		String inl = scn.nextLine();
		char[] part = inl.toCharArray();
		
		int pl = part.length;
		int[] part_value = new int[pl];
		int[] test_value = new int[pl];
		char[] test_part = new char[pl];
			
		for(int j = 0 ; j < part.length ; j++){
			for(int i = 0 ; i < alph.length ; i++){
				if(part[j] == alph[i]){
					part_value[j] = i;
	//				System.out.print(i + " ") ;
				}
			}
		}
	//	System.out.println();

		whole:{
			for(int a = 1 ; a < 26 ; a++){
				for(int b = 0 ; b < 26 ;b++){
					for(int j = 0 ; j < pl ; j++){
						test_value[j] = affine(part_value[j] , a , b);
					}
					for(int j = 0 ; j < pl ; j++){
	//					System.out.println("a : " + a + " b : "+ b + " j : " + j );
						for(int p = 0 ; p < pl ; p++){
	//						System.out.print(test_value[p] + " ");
						}
	//					System.out.println();
						if(j == 4){
							if(test_value[0] == 19 && test_value[1] == 7 && test_value[4] == 26){
								if(test_value[2] == 8 && test_value[3] == 18){
	//								System.out.println("break");
									break whole;
								}
								else if(test_value[2] == 0 && test_value[3] == 19){
	//								System.out.println("break");
									break whole;
								}
							}
						}
						else if(j > 5){
							if(test_value[j] == 26 && test_value[j-5] == 26){
								if(test_value[j-4] == 19 && test_value[j-3] == 7){
									if( (test_value[j-2] == 8 && test_value[j-1] == 18) || test_value[j-2] == 0 && test_value[j-1] == 19){
	//									System.out.println("break");
										break whole;
									}
								}	
							}	
						}
					}
				}
			}
		}
		for(int p = 0 ; p < pl ; p++){
			test_part[p] = alph[test_value[p]];
		}
		String str = String.valueOf(test_part);
		System.out.println(str);
	}

}