import javax.script.*;
class Main{
	public static void main(String[]z){
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("JavaScript");
       
        engine.eval("println('Hello JavaScript from Java.')");
       

	}
}