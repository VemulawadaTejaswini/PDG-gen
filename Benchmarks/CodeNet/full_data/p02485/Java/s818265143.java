public class Main { 
   long number; 
   public main(long number){ 
      setNumber(number); 
   } 

   public long addNumbers(){ 
      long number = this.number; 
      long sum = 0; 
       
      number = Math.abs(number); 
       
      do { 
         sum += number % 10; 
      } while((number /= 10) != 0); 
       
      return sum; 
   } 
    
   public void setNumber(long number){ 
      this.number = number; 
   } 
    
   public long getNumber(){ 
      return number; 
   } 
} 