import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {

	public String calculateStrangeMath(List<String> strangeList, ScriptEngine engine, String result) throws ScriptException{
		int strsLength = strangeList.size();
		List<String> tmpStrangeList = new ArrayList<String>();
		for(int iShift = 0; iShift < strsLength - 2; iShift++){
			if(((strangeList.get(iShift) != null) && (strangeList.get(iShift) != "+") &&
					(strangeList.get(iShift) != "-") && (strangeList.get(iShift) != "*") && (strangeList.get(iShift) != "/")) &&
					((strangeList.get(iShift + 1) != null) && (strangeList.get(iShift + 1) != "+") &&
							(strangeList.get(iShift + 1) != "-") && (strangeList.get(iShift + 1) != "*") && (strangeList.get(iShift + 1) != "/")) &&
					((strangeList.get(iShift + 2) == "+") || (strangeList.get(iShift + 2) == "-") ||
							(strangeList.get(iShift + 2) == "*") || (strangeList.get(iShift + 2) == "/"))){
				tmpStrangeList.add( engine.eval(strangeList.get(iShift) + strangeList.get(iShift + 2) + strangeList.get(iShift + 1)).toString());
				
				strangeList.set(iShift, null);
				strangeList.set(iShift + 1, null);
				strangeList.set(iShift + 2, null);
			} else if(strangeList.get(iShift) != null && iShift != strsLength - 3){
				tmpStrangeList.add(strangeList.get(iShift));
			} else if(iShift == strsLength - 3){
				if(strangeList.get(iShift) != null)		tmpStrangeList.add(strangeList.get(iShift));
				if(strangeList.get(iShift + 1) != null)	tmpStrangeList.add(strangeList.get(iShift + 1));
				if(strangeList.get(iShift + 2) != null)	tmpStrangeList.add(strangeList.get(iShift + 2));
			}
		}
		strangeList.clear();
		
		result = tmpStrangeList.get(0);
		if(tmpStrangeList.size() != 1)	result = calculateStrangeMath(tmpStrangeList, engine, result);
		
		return result;
	}

	public static void main(String[] args) throws ScriptException{
		Main sme = new Main();
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("js");

		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			String[] strs = input.nextLine().split(" ");
			List<String> strangeList = new ArrayList<String>(Arrays.asList(strs));
			System.out.print(sme.calculateStrangeMath(strangeList, engine, ""));
		}
		input.close();
	}
}