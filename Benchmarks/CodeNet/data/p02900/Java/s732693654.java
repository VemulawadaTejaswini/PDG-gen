import java.util.*;
public class Main {
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  // 整数の入力
  long A = sc.nextLong();
  long B =sc.nextLong();
  List<Long> sosus = new ArrayList<Long>();
  long count = 1;
  if(A>B){
   for(long i=2;i*i<=B;i++){
     if(sosuu(i,sosus)){
       sosus.add(i);
       if(A%i==0&&B%i==0){
         count++; 
       }
  	 }
   }
    if(sosuu(B,sosus)&&B>1){
       if(A%B==0){
         count++; 
       }
    }
  }else{
   for(long i=2;i*i<=A;i++){
     if(sosuu(i,sosus)){
       sosus.add(i);
       if(A%i==0&&B%i==0){
         count++; 
       }
  	 }
   }
   if(sosuu(A,sosus)&&A>1){
       if(B%A==0){
         count++; 
       }
    }
  }

  System.out.print(count);
} 

   //素数判定的なあれ
	public static  boolean sosuu(Long lon,List<Long> sosus){
      long start=1L;
      if(lon<3){
       return true; 
      }
      for(long sosu:sosus){
          if(lon%sosu==0){
            return false;
          }
        if(sosu*sosu>lon){
          return true;
        }
        start = sosu;
      }
		for (long i = start+1; i*i < lon; ++i) {
			if(lon%i==0){
             return false;
            }
		}
      return true;
	}

  
}