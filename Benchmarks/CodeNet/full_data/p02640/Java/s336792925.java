import java.util.Scanner;

class Calc{

  	byte legs;
  	byte animals;
  
  	public Calc(byte legs, byte animals){
    	this.legs = legs;
      	this.animals = animals;
    }
	
	public String combine(){
    	int base = legs - 2*animals;
      
     	if (base<0||base%2!=0||base/2>animals){
        	return "No";
        }else{
        	return "Yes";
        }
    }

}

class Main{
	
	public static void main(String[] args){
    	
      	Scanner scanner = new Scanner(System.in);
      	String str = scanner.nextLine();
    	String[] input_ = str.split(" ", 0);
      	
      	Calc calc = new Calc(Byte.parseByte(input_[1]), Byte.parseByte(input_[0]));
      
      	System.out.print(calc.combine());
    }

}