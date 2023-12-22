
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		String line;
		String now = "A";
		while ((line = reader.readLine()) != null) {
			if (line.isEmpty())
				break;
			double a = Double.parseDouble(line);
			if(a>91.00)
				builder.append("heavy").append('\n');
			else if(a>81.00)
				builder.append("light heavy").append('\n');
			else if(a>75.00)
				builder.append("middle").append('\n');
			else if(a>69.00)
				builder.append("light middle").append('\n');
			else if(a>64.00)
				builder.append("welter").append('\n');
			else if(a>60.00)
				builder.append("light welter").append('\n');
			else if(a>57.00)
				builder.append("light").append('\n');
			else if(a>54.00)
				builder.append("feather").append('\n');
			else if(a>51.00)
				builder.append("bantam").append('\n');
			else if(a>48.00)
				builder.append("fly").append('\n');
			else
				builder.append("light fly").append('\n');
		}
		System.out.print(builder);
	}
}