import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String weather = br.readLine();
		
		String tomorrow_weather;
		if(weather.equals("Sunny")) {
			tomorrow_weather = "Cloudy";
		} else if(weather.equals("Cloudy")){
			tomorrow_weather = "Rainy";
		} else {
			tomorrow_weather = "Sunny";
		}

		System.out.println(tomorrow_weather);
	}
}