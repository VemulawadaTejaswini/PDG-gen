import java.io.BufferedReader;
import java.io.InputStreamReader;
//ツつスツつセツづ個スツタツッツク
//public class Problem0013_SwitchingRailroadCars {
public class Main {
	public static void main(String[] args) {
		try {
		//	Problem0013_SwitchingRailroadCars test = new Problem0013_SwitchingRailroadCars();
		//	Main test = new Main();
			
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String line;
			CarStack stack = new CarStack();
			while((line = reader.readLine()) != null) {
				try {
					int number = Integer.parseInt(line);
					if(number == 0) {
						System.out.println(stack.pop());	//nullツづ債考ツ猟カツつオツづ按つ「
					} else {
						stack.push(new Car(number));
					}
				} catch(NumberFormatException e) {
					break;
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
class CarStack {
	private Car lastCar;
	
	CarStack() {
		lastCar = null;
	}
	void push(Car car) {
		if(lastCar != null) {
			car.setPrevious(lastCar);
			lastCar = car;
		} else {
			lastCar = car;
		}
	}
	Car pop() {
		if(lastCar != null) {
			Car result = lastCar;
			lastCar = lastCar.getPrevious();
			
			return result;
		} else {
			return null;
		}
	}
}
class Car {
	private int number;
	private Car previousCar;
	
	Car(int number) {
		this.number = number;
		previousCar = null;
	}
	Car getPrevious() {
		return previousCar;
	}
	void setPrevious(Car car) {
		previousCar = car;
	}
	@Override
	public String toString() {
		return Integer.toString(number);
	}
}